package sa.factory.app1289880.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sa.factory.app1289880.data.AptitudeQuestionReviewSessionRepository
import sa.factory.app1289880.model.AptitudeQuestionReviewSession
import sa.factory.app1289880.model.VerbalQuestionAssessmentRecord
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class AptitudeQuestionReviewSessionViewModel(
    private val repository: AptitudeQuestionReviewSessionRepository
) : ViewModel() {
    val catalog: StateFlow<List<VerbalQuestionAssessmentRecord>> = repository.getAvailableCatalog()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeRequest: StateFlow<AptitudeQuestionReviewSession?> = repository.getActiveRequest()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun submitNewOrder(request: AptitudeQuestionReviewSession) {
        viewModelScope.launch {
            repository.submitRequest(request)
        }
    }
}
