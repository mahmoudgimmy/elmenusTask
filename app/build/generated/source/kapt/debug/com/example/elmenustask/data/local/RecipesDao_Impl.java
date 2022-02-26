package com.example.elmenustask.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.elmenustask.models.Item;
import com.example.elmenustask.models.Tag;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipesDao_Impl implements RecipesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Tag> __insertionAdapterOfTag;

  private final EntityInsertionAdapter<Item> __insertionAdapterOfItem;

  public RecipesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTag = new EntityInsertionAdapter<Tag>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Tag` (`id`,`tagName`,`photoURL`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Tag value) {
        stmt.bindLong(1, value.getId());
        if (value.getTagName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTagName());
        }
        if (value.getPhotoURL() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhotoURL());
        }
      }
    };
    this.__insertionAdapterOfItem = new EntityInsertionAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Item` (`key`,`id`,`tagName`,`name`,`photoUrl`,`description`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getKey());
        stmt.bindLong(2, value.getId());
        if (value.getTagName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTagName());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getPhotoUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhotoUrl());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
      }
    };
  }

  @Override
  public Object insertTag(final Tag tag, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTag.insert(tag);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertItem(final Item item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object loadAllTags(final Continuation<? super List<Tag>> continuation) {
    final String _sql = "SELECT * FROM Tag";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Tag>>() {
      @Override
      public List<Tag> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTagName = CursorUtil.getColumnIndexOrThrow(_cursor, "tagName");
          final int _cursorIndexOfPhotoURL = CursorUtil.getColumnIndexOrThrow(_cursor, "photoURL");
          final List<Tag> _result = new ArrayList<Tag>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Tag _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTagName;
            if (_cursor.isNull(_cursorIndexOfTagName)) {
              _tmpTagName = null;
            } else {
              _tmpTagName = _cursor.getString(_cursorIndexOfTagName);
            }
            final String _tmpPhotoURL;
            if (_cursor.isNull(_cursorIndexOfPhotoURL)) {
              _tmpPhotoURL = null;
            } else {
              _tmpPhotoURL = _cursor.getString(_cursorIndexOfPhotoURL);
            }
            _item = new Tag(_tmpId,_tmpTagName,_tmpPhotoURL);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object loadItems(final String tagName,
      final Continuation<? super List<Item>> continuation) {
    final String _sql = "SELECT * FROM Item Where tagName = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (tagName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, tagName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Item>>() {
      @Override
      public List<Item> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTagName = CursorUtil.getColumnIndexOrThrow(_cursor, "tagName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfPhotoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUrl");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final List<Item> _result = new ArrayList<Item>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Item _item;
            final int _tmpKey;
            _tmpKey = _cursor.getInt(_cursorIndexOfKey);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTagName;
            if (_cursor.isNull(_cursorIndexOfTagName)) {
              _tmpTagName = null;
            } else {
              _tmpTagName = _cursor.getString(_cursorIndexOfTagName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpPhotoUrl;
            if (_cursor.isNull(_cursorIndexOfPhotoUrl)) {
              _tmpPhotoUrl = null;
            } else {
              _tmpPhotoUrl = _cursor.getString(_cursorIndexOfPhotoUrl);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item = new Item(_tmpKey,_tmpId,_tmpTagName,_tmpName,_tmpPhotoUrl,_tmpDescription);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
