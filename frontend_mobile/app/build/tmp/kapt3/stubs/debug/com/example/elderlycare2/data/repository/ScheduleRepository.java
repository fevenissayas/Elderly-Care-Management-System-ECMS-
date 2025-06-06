package com.example.elderlycare2.data.repository;

import com.example.elderlycare2.data.api.ScheduleApi;
import com.example.elderlycare2.data.remote.response.TaskResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/elderlycare2/data/repository/ScheduleRepository;", "", "scheduleApi", "Lcom/example/elderlycare2/data/api/ScheduleApi;", "(Lcom/example/elderlycare2/data/api/ScheduleApi;)V", "getTasks", "", "Lcom/example/elderlycare2/data/remote/response/TaskResponse;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ScheduleRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.elderlycare2.data.api.ScheduleApi scheduleApi = null;
    
    @javax.inject.Inject()
    public ScheduleRepository(@org.jetbrains.annotations.NotNull()
    com.example.elderlycare2.data.api.ScheduleApi scheduleApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTasks(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.elderlycare2.data.remote.response.TaskResponse>> $completion) {
        return null;
    }
}