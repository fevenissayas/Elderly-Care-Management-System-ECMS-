package com.example.elderlycare2.data.api;

import com.example.elderlycare2.data.remote.response.NurseListResponseWrapper;
import com.example.elderlycare2.data.remote.response.TasksResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/elderlycare2/data/api/ScheduleApi;", "", "getTasks", "Lretrofit2/Response;", "Lcom/example/elderlycare2/data/remote/response/TasksResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ScheduleApi {
    
    @retrofit2.http.GET(value = "user/tasks")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTasks(@retrofit2.http.Header(value = "Authorization")
    @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.elderlycare2.data.remote.response.TasksResponse>> $completion);
}