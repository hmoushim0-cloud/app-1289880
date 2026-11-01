package sa.factory.app1289880.data

import sa.factory.app1289880.model.AptitudeQuestionReviewSession
import sa.factory.app1289880.model.VerbalQuestionAssessmentRecord
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface AptitudeQuestionReviewSessionRepository {
    fun getAvailableCatalog(): Flow<List<VerbalQuestionAssessmentRecord>>
    fun getActiveRequest(): Flow<AptitudeQuestionReviewSession?>
    suspend fun submitRequest(request: AptitudeQuestionReviewSession): Result<String>
}

class InMemoryAptitudeQuestionReviewSessionRepository : AptitudeQuestionReviewSessionRepository {
    private val _catalog = MutableStateFlow<List<VerbalQuestionAssessmentRecord>>(listOf(
        VerbalQuestionAssessmentRecord("1", "حزمة مراجعة المفردة الشاذة (99 سؤالاً)", "تدقيق لغوي ومنطقي لأسئلة المفردة الشاذة (الارتباط والاختلاف) مع حكم: صالح للنشر أو يحتاج تعديل، وتحديد نقاط الغموض أو الخطأ بدقة.", 5000L, "verified"),
        VerbalQuestionAssessmentRecord("2", "حزمة تحديثات وتحسين صياغة الأسئلة", "اقتراحات تحريرية قابلة للتطبيق لمعالجة التعديلات المطلوبة، وتحسين الوضوح دون تغيير الهدف التقييمي للسؤال.", 9500L, "bolt")
    ))
    private val _active = MutableStateFlow<AptitudeQuestionReviewSession?>(null)

    override fun getAvailableCatalog(): Flow<List<VerbalQuestionAssessmentRecord>> = _catalog.asStateFlow()
    override fun getActiveRequest(): Flow<AptitudeQuestionReviewSession?> = _active.asStateFlow()

    override suspend fun submitRequest(request: AptitudeQuestionReviewSession): Result<String> {
        _active.value = request
        return Result.success(request.requestId)
    }
}
