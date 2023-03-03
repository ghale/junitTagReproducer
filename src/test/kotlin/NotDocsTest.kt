import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class NotDocsTest {
    @Test
    fun shouldPass() {
        assert(true)
    }

    @Test
    fun shouldFail() {
        assert(false)
    }
}