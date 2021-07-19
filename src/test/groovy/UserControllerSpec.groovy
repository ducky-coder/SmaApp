import com.example.smabro_app.application.facade.UserFacade
import com.example.smabro_app.presentation.controller.api.UserController
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import spock.lang.Specification

@SpringBootTest
class UserControllerSpec extends Specification {

    UserController userController
    UserFacade userFacade

    def setUp() {
        userFacade = Mock(UserFacade)
        userController = new UserController(userFacade)
    }

    def "checkメソッドテスト"() {
        when:
        def actual = userController.hello()

        then:
        actual == "hello"
    }
}
