import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Tag("restdocs")
class DocsTest {
    @Test
    fun shouldPass() {
        assert(true)
    }

    @Test
    fun shouldFail() {
        assert(false)
    }
}