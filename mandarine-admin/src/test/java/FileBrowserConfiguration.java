

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.starry.mandarine.biz.controller.FileBrowserController;
import com.starry.mandarine.biz.domain.FileBrowser;
import com.starry.mandarine.biz.service.FileBrowserService;

@Configuration
@EnableWebMvc
public class FileBrowserConfiguration {

	@Bean
	public FileBrowserService getFileBrowserService() {
		return Mockito.mock(FileBrowserService.class);
	}
	
	@Bean
	public FileBrowserController getFileBrowserController() {
		return new FileBrowserController();
	}
}
