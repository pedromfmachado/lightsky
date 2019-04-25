package com.machado.lightsky.core.providers

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class TestReactiveSchedulerProvider : ReactiveSchedulerProvider {
    override val io: Scheduler get() = Schedulers.trampoline()
    override val main: Scheduler get() = Schedulers.trampoline()
}