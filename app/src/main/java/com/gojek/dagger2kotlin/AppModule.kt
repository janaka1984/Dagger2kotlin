package com.gojek.dagger2kotlin

import dagger.Module
import dagger.Provides

@Module
class AppModule{

     @Provides
     fun AppModule():String{
         return "2eggs"
     }

}