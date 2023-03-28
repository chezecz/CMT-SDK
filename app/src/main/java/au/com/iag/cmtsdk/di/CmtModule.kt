package au.com.iag.cmtsdk.di

import android.content.Context
import au.com.iag.cmtsdk.CmtAppModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CmtModule {
    @Provides
    fun provideAppModel(@ApplicationContext ctx: Context): CmtAppModel = CmtAppModel(ctx)
}
