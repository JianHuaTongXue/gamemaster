package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import com.luckygames.wmxz.gamemaster.service.AdminService;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucky on 2018/3/28.
 */
@RestController
@RequestMapping("/player")
public class PlayerCharacterController extends BaseController {
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/character", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryCharacter(PlayerCharacterSearchQuery playerCharacterSearchQuery) {
        if (playerCharacterSearchQuery.getPageNum() == null) {
            playerCharacterSearchQuery.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.queryCharacterDailyReport(playerCharacterSearchQuery);

        Response r = new Response("player/character")
                .request(playerCharacterSearchQuery)
                .data("characters", characters);
        return r;
    }

    @RequestMapping(value = "/forbidden", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryForbidden(ForbiddenSearchQuery forbiddenQuery) {
        return new Response("player/forbidden")
                .request(forbiddenQuery)
                .data("", null);
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryPlayer(PlayerCharacterSearchQuery playerCharacterSearchQuery) {
        if (playerCharacterSearchQuery.getPageNum() == null) {
            playerCharacterSearchQuery.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.searchPage(playerCharacterSearchQuery);

        Response r = new Response("player/info")
                .request(playerCharacterSearchQuery)
                .data("characters", characters);
        return r;
    }

    @RequestMapping(value = "/gm", method = {RequestMethod.GET})
    public String gm() {
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("ban", "1");
        reqParams.put("type", "1");
        reqParams.put("id", "1");
        reqParams.put("hour", "1");

        return "success";
    }
}
