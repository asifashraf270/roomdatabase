package com.inyongtisto.roomdatabase.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/inyongtisto/roomdatabase/room/DaoNote;", "", "delete", "", "data", "Lcom/inyongtisto/roomdatabase/model/NoteModel;", "deleteAll", "", "getAll", "", "getNote", "id", "", "insert", "update", "app_debug"})
public abstract interface DaoNote {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.model.NoteModel data);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.model.NoteModel data);
    
    @androidx.room.Update()
    public abstract int update(@org.jetbrains.annotations.NotNull()
    com.inyongtisto.roomdatabase.model.NoteModel data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from note ORDER BY id ASC")
    public abstract java.util.List<com.inyongtisto.roomdatabase.model.NoteModel> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM note WHERE id = :id LIMIT 1")
    public abstract com.inyongtisto.roomdatabase.model.NoteModel getNote(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Query(value = "DELETE FROM note")
    public abstract int deleteAll();
}