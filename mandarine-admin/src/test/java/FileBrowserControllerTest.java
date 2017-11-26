

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.starry.mandarine.biz.controller.FileBrowserController;
import com.starry.mandarine.biz.domain.FileBrowser;
import com.starry.mandarine.biz.service.FileBrowserService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes=FileBrowserConfiguration.class)
public class FileBrowserControllerTest {

	MockMvc mvc;
	
	@Autowired
	FileBrowserService fileBrowserService;
	
	@Autowired
	FileBrowserController fileBrowserController;
	
	@Before
	public void before() throws Exception {
		this.mvc = MockMvcBuilders.standaloneSetup(fileBrowserController).build();
	}
	
	@Test
	public void fileBrowserTest_nomal() throws Exception {
		when(fileBrowserService.getFileBrowser()).thenReturn(new FileBrowser());
		mvc.perform(get("/fileBrowser.do"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
			.andDo(print());
	}
	
	@Test
	public void fileBrowserTest_null() throws Exception {
		when(fileBrowserService.getFileBrowser()).thenReturn(null);
		mvc.perform(get("/fileBrowser.do"))
			.andExpect(status().isOk())
			.andExpect(content().string(isEmptyOrNullString()))
			.andDo(print());
	}
}
