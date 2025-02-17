package ru.otus.daggerhomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppSubcomponents::class])
interface ApplicationComponent {
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance @AppContext context: Context):ApplicationComponent
    }
    fun mainComponent(): MainActivityComponent.Factory
}