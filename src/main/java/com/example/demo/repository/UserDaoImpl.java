package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

public class UserDaoImpl implements UserDao {
	
	
	private static final String TABLE_NAME = "user ";
    private static final String SELECT_SQL = "SELECT id, username, email, password, enabled, authority_id, tempkey ";
    private static final String FROM_SQL = "FROM " + TABLE_NAME;
    private static final String PRIMARY_KEY_WHERE_SQL = "WHERE id = ? ";
    private static final String ORDER_BY_SQL = "ORDER BY id";

    private static final String FIND_ALL_SQL = SELECT_SQL + FROM_SQL + ORDER_BY_SQL;
    private static final String FIND_ACTIVE_USERS_SQL = SELECT_SQL + FROM_SQL + "WHERE enabled = 1 " + ORDER_BY_SQL;
    private static final String FIND_BY_ID_SQL = SELECT_SQL + FROM_SQL + PRIMARY_KEY_WHERE_SQL;

    private static final String INSERT_SQL = "INSERT INTO " + TABLE_NAME +
            "(username, email, password, enabled, authority_id, tempkey) " +
            "VALUES(?, ?, ?, ?, ?, ?)";

    private static final String UPDATE_SQL = "UPDATE " + TABLE_NAME +
            "SET username = ?, email = ?, password = ?, enabled = ?, authority_id = ?, tempkey = ? " +
            PRIMARY_KEY_WHERE_SQL;

    private static final String DELETE_BY_ID_SQL = "DELETE FROM " + TABLE_NAME + PRIMARY_KEY_WHERE_SQL;

    private static final RowMapper<User> USER_ROW_MAPPER = (rs, rowNum) -> {
        var user = new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        return user;
    };
	
	private final JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		/*String query ="SELECT *"
				+" FROM user";
		
		List<Map<String,Object>> resultList = jdbcTemplate.queryForList(query);
		*/
		//System.out.println(resultList.get(0).get(resultList));
		
		//List<User> list = new ArrayList<User>();
		
		/*for(Map<String,Object> result : resultList) {
			User user = new User();
			user.setId((int)result.get("ID"));
			user.setUsername((String) result.get("NAME"));
			user.setPassword((String) result.get("PASSworD"));
			user.setAdmin_flg((int) result.get("ADMIN_FLG"));
			
			list.add(user);
			
		}*/
		//return list;
		//Map<String,Object> user=jdbcTemplate.queryForMap(query,1);
		//return jdbcTemplate.query(FIND_ALL_SQL, USER_ROW_MAPPER);
		return null;
	}

	@Override
	public List<User> findActiveUsers() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		String query ="SELECT *"
				+" FROM user"
				+" WHERE id = ?";
		
		Map<String,Object> userM=jdbcTemplate.queryForMap(query,1);
		
		User user = new User();
		user.setId((int)userM.get("ID"));
		user.setUsername((String) userM.get("NAME"));
		user.setPassword((String) userM.get("PASSworD"));
		
		return user;
		//return null;
	}

	@Override
	public int insert(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int update(User user) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}


