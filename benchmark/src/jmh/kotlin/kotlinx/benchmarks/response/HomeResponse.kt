package response

import com.squareup.moshi.JsonClass
import kotlinx.serialization.Serializable
import response.ElementResponse

@Serializable
@JsonClass(generateAdapter = true)
data class HomeResponse(
        val element: ElementResponse
)