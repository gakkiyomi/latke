package org.b3log.latke.repository.postgresql.mapping;

import org.b3log.latke.repository.jdbc.mapping.Mapping;
import org.b3log.latke.repository.jdbc.util.FieldDefinition;

/**
 * PostgreSQL int type mapping.
 *
 * @author <a href="https://ld246.com/member/Gakkiyomi2019">Gakkiyomi</a>
 * @version 1.0.0.0, Feb 2, 2021
 */
public class IntMapping implements Mapping {
    @Override
    public String toDataBaseString(final FieldDefinition definition) {
        final StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("\"").append(definition.getName()).append("\"").append(" INT");
        if (!definition.getNullable()) {
            sqlBuilder.append(" NOT NULL");
        }
        return sqlBuilder.toString();
    }
}
