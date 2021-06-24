package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val repoId: Int, val prevKey: Int?, val nextKey: Int?
)