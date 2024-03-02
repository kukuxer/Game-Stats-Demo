package com.stats.StatisticProject;

import com.stats.StatisticProject.service.GameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewMethodReturnValueHandler;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@SpringBootTest
@AutoConfigureMockMvc
class StatisticProjectApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private GameService service;

	@Test
	void testHomeMethod() throws Exception{

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/home"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();

		ModelAndView mav = mvcResult.getModelAndView();

		ModelAndViewAssert.assertViewName(mav, "home-page");
	}

	@Test
	void testListMethod() throws Exception {

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/list")
						.param("name", "name")
						.param("opponent", "opponent")
						.param("winOrLose", "W")
						.param("date", "date")
						.param("isDate", "isDate")
						.param("secondDate", "secondDate")
						.param("isSecondDate", "isSecondDate"))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(model().attribute("winAmount", "5"))
						.andExpect(model().attribute("loseAmount", "2"))
						.andExpect(model().attribute("gamesAmount", "5"))
						.andExpect(model().attribute("date", "02.11.2021"))
						.andExpect(model().attribute("secondDate", "02.11.2021"))
						.andExpect(model().attribute("isEverything", "yes"))
						.andExpect(model().attribute("allScore", "6"))
						.andExpect(model().attribute("scoreList", "3"))
						.andExpect(model().attribute("opponentsScoreList", "3"))
						.andExpect(model().attribute("games", "3"))
						.andExpect(model().attribute("player", "3"))
						.andExpect(model().attribute("result", "3"))
				.andReturn();

		ModelAndView mav = mvcResult.getModelAndView();

		ModelAndViewAssert.assertViewName(mav, "list-page");


//		when(service.findAll()).thenReturn(Collections.emptyList());
//		verify(service, times(1)).findAll();
	}
}
