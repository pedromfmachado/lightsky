package com.machado.lightsky.core.providers

import io.reactivex.Scheduler

interface ReactiveSchedulerProvider {
    val io: Scheduler
    val main: Scheduler
}