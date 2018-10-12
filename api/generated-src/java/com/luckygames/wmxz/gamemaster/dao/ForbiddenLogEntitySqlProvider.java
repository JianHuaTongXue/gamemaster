package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ForbiddenLogEntitySqlProvider {

    public String countByExample(ForbiddenLogEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("forbidden_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ForbiddenLogEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("forbidden_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ForbiddenLogEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("forbidden_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=BIGINT}");
        }
        
        if (record.getIpAddress() != null) {
            sql.VALUES("ip_address", "#{ipAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getForbiddenType() != null) {
            sql.VALUES("forbidden_type", "#{forbiddenType,jdbcType=INTEGER}");
        }
        
        if (record.getExpireTime() != null) {
            sql.VALUES("expire_time", "#{expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            sql.VALUES("operate_type", "#{operateType,jdbcType=INTEGER}");
        }
        
        if (record.getOperateTime() != null) {
            sql.VALUES("operate_time", "#{operateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlayerName() != null) {
            sql.VALUES("player_name", "#{playerName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ForbiddenLogEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("server_id");
        sql.SELECT("player_id");
        sql.SELECT("char_id");
        sql.SELECT("ip_address");
        sql.SELECT("forbidden_type");
        sql.SELECT("expire_time");
        sql.SELECT("reason");
        sql.SELECT("operate_type");
        sql.SELECT("operate_time");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("player_name");
        sql.FROM("forbidden_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ForbiddenLogEntity record = (ForbiddenLogEntity) parameter.get("record");
        ForbiddenLogEntityExample example = (ForbiddenLogEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("forbidden_log");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        }
        
        if (record.getIpAddress() != null) {
            sql.SET("ip_address = #{record.ipAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getForbiddenType() != null) {
            sql.SET("forbidden_type = #{record.forbiddenType,jdbcType=INTEGER}");
        }
        
        if (record.getExpireTime() != null) {
            sql.SET("expire_time = #{record.expireTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        }
        
        if (record.getOperateType() != null) {
            sql.SET("operate_type = #{record.operateType,jdbcType=INTEGER}");
        }
        
        if (record.getOperateTime() != null) {
            sql.SET("operate_time = #{record.operateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPlayerName() != null) {
            sql.SET("player_name = #{record.playerName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("forbidden_log");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        sql.SET("ip_address = #{record.ipAddress,jdbcType=VARCHAR}");
        sql.SET("forbidden_type = #{record.forbiddenType,jdbcType=INTEGER}");
        sql.SET("expire_time = #{record.expireTime,jdbcType=TIMESTAMP}");
        sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        sql.SET("operate_type = #{record.operateType,jdbcType=INTEGER}");
        sql.SET("operate_time = #{record.operateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("player_name = #{record.playerName,jdbcType=VARCHAR}");
        
        ForbiddenLogEntityExample example = (ForbiddenLogEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ForbiddenLogEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}