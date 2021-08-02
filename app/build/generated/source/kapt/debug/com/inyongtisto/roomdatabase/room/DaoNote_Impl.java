package com.inyongtisto.roomdatabase.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.inyongtisto.roomdatabase.model.NoteModel;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class DaoNote_Impl implements DaoNote {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNoteModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfNoteModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfNoteModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public DaoNote_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteModel = new EntityInsertionAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `note`(`id`,`title`,`description`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.title == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.title);
        }
        if (value.description == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.description);
        }
      }
    };
    this.__deletionAdapterOfNoteModel = new EntityDeletionOrUpdateAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `note` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfNoteModel = new EntityDeletionOrUpdateAdapter<NoteModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `note` SET `id` = ?,`title` = ?,`description` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.title == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.title);
        }
        if (value.description == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.description);
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM note";
        return _query;
      }
    };
  }

  @Override
  public void insert(NoteModel data) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteModel.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(NoteModel data) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfNoteModel.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int update(NoteModel data) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfNoteModel.handle(data);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<NoteModel> getAll() {
    final String _sql = "SELECT * from note ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final List<NoteModel> _result = new ArrayList<NoteModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteModel _item;
        _item = new NoteModel();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        _item.title = _cursor.getString(_cursorIndexOfTitle);
        _item.description = _cursor.getString(_cursorIndexOfDescription);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public NoteModel getNote(String id) {
    final String _sql = "SELECT * FROM note WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final NoteModel _result;
      if(_cursor.moveToFirst()) {
        _result = new NoteModel();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        _result.title = _cursor.getString(_cursorIndexOfTitle);
        _result.description = _cursor.getString(_cursorIndexOfDescription);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
