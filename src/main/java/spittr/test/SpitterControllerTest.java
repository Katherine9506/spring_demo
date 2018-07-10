package spittr.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.data.SpitterRepository;
import spittr.domain.Spitter;
import spittr.web.SpitterController;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class SpitterControllerTest {

    private SpitterRepository mockRepository;

//    @Before
//    public void setUp() {
//        this.mockRepository = mock(SpitterRepository.class);
//    }

    @Test
    public void showRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void testPostRegistration() throws Exception {
        Spitter unsaved = new Spitter("Elena", "G", "Katherine", "123456");
        Spitter saved = new Spitter(24L, "Elena", "G", "Katherine", "123456");

        SpitterRepository mockRepository = mock(SpitterRepository.class);
        when(mockRepository.save(unsaved))
                .thenReturn(saved);
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Elena")
                .param("lastName", "G")
                .param("username", "Katherine")
                .param("password", "123456"))
                .andExpect(redirectedUrl("/spitter/Katherine"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }
}