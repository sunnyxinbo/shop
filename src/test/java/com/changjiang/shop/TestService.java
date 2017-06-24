package com.changjiang.shop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.changjiang.config.MyMvcConfig;
import com.changjiang.entity.Users;
import com.changjiang.service.StoreService;
import com.changjiang.service.UsersService;
import com.changjiang.service.UsersServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestService {
	
	@Autowired
	private UsersServiceImpl service;
	@Autowired 
	private StoreService storeService;
	@Autowired
	private UsersService userService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String storeNumber=userService.selectUsersHaveAll(1).getStore();
		assertEquals(1,storeNumber);
	}

}
