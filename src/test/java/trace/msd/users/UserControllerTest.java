package trace.msd.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import trace.msd.cellule.celluleService;
import trace.msd.recu.recuService;
import trace.msd.tiket.tiketService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @MockBean
    private recuService recuService;

    @MockBean
    private trace.msd.tiket.tiketService tiketService;

    @MockBean
    private trace.msd.cellule.celluleService celluleService;

    @Test
    void getUsers() throws Exception {

        //Mock the returned date

        User user = new User(1,"Bitomagira","steve","stv","chef cellule","123456");

        List<User> list = new ArrayList<User>();

        list.add(user);

        when(userService.getAll()).thenReturn(list);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/users"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)))          //check the size of the returned array
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].nom").value("Bitomagira"))
                .andExpect(status().isOk());

    }

    @Test
    void postUser() throws Exception {

        User user = new User(1,"Bitomagira","steve","stv","chef cellule","123456");

        List<User> list = new ArrayList<User>();

        list.add(user);

        when(userService.postUser(user)).thenReturn(user);

       MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
               .characterEncoding("utf-8")
                .content(new ObjectMapper().writeValueAsString(user)))
                .andDo(print())
                .andExpect(status().isOk())
               .andReturn();

//       assertEquals(result.getResponse().getContentAsString(),user);
    }
//
//    @Test
//    void getUserLogin() {
//    }
//
//    @Test
//    void updateUser() {
//    }
}