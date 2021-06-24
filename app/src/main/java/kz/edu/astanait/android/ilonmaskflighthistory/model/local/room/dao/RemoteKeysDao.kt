package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.RemoteKeys

@Dao
interface RemoteKeysDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(remoteKey: List<RemoteKeys>)

    @Query("SELECT * FROM remotekeys WHERE repoId = :id")
    suspend fun remoteKeysDoggoId(id: Int): RemoteKeys?

    @Query("DELETE FROM remotekeys")
    suspend fun clearRemoteKeys()
}