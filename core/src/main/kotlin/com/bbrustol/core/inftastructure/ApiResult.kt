package com.bbrustol.core.inftastructure

sealed interface ApiResult<T : Any>
    class ApiSuccess<T : Any> (val data: T) : ApiResult<T>
    class ApiError<T : Any> (val code: Int, val message: String?, val serviceStatusType: ServerStatusType) : ApiResult<T>
    class ApiException<T : Any> (val throwable: Throwable? = null, val serviceStatusType: ServerStatusType) : ApiResult<T>
    class WithoutInternet<T: Any> (val serviceStatusType: ServerStatusType) : ApiResult<T>
