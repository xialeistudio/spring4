import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.xialei.spring4.ch3.fortest.TestBean
import org.xialei.spring4.ch3.fortest.TestConfig

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(classes = arrayOf(TestConfig::class))
@ActiveProfiles("prod")
class DemoBeanIntegrationTests {
    @Autowired
    lateinit var bean: TestBean

    @Test
    fun prodBeanShouldInject() {
        val expected = "from production profile"
        val actual = bean.content
        Assert.assertEquals(expected, actual)
    }
}