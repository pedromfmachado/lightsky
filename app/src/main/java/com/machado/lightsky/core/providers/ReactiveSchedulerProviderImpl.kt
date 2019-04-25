package com.machado.lightsky.core.providers

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ReactiveSchedulerProviderImpl : ReactiveSchedulerProvider {
    override val io: Scheduler get() = Schedulers.io()
    override val main: Scheduler get() = AndroidSchedulers.mainThread()
}