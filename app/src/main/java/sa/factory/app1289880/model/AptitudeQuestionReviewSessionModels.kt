package sa.factory.app1289880.model

import kotlinx.serialization.Serializable

@Serializable
data class VerbalQuestionAssessmentRecord(
    val id: String,
    val title: String,
    val description: String,
    val priceMinorUnits: Long,
    val iconVector: String = "verified"
)

@Serializable
data class AptitudeQuestionReviewSession(
    val requestId: String,
    val items: List<VerbalQuestionAssessmentRecord>,
    val customerPhone: String,
    val totalAmountMinorUnits: Long,
    val status: AptitudeQuestionReviewSessionStatus = AptitudeQuestionReviewSessionStatus.PENDING,
    val createdAtEpochMs: Long = System.currentTimeMillis()
)

enum class AptitudeQuestionReviewSessionStatus {
    PENDING,
    ACCEPTED,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
