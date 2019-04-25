package com.machado.lightsky.core.ext

import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

fun <T> Single<T>.subscribeBy(onSuccess: (T) -> Unit, onError: (Throwable) -> Unit) = subscribe(onSuccess, onError)

fun Disposable.addTo(compositeDisposable: CompositeDisposable) {
    compositeDisposable.add(this)
}

fun <T> T.toSingle(): Single<T> = Single.just(this)