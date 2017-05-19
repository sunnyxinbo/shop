package com.changjiang.shop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.changjiang.config.MyMvcConfig;
import com.changjiang.entity.Duty;
import com.changjiang.service.DutyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestDutyDAO {
	@Autowired
	private DutyService service;
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
			Duty duty=service.getDuty(1);
			Assert.assertEquals(1,(int)duty.getId());
			Assert.assertEquals("2",duty.getName());
			Assert.assertEquals("2",duty.getDesc());
	}

}