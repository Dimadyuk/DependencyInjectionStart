package com.example.dependencyinjectionstart.example2.data.datasource

import com.example.dependencyinjectionstart.example2.data.database.ExampleDataBase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val dataBase: ExampleDataBase
): ExampleLocalDataSource {
    override fun method() {
        dataBase.method()
    }
}
