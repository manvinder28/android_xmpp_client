package nl.sison.xmpp.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.SqlUtils;

import nl.sison.xmpp.dao.BuddyEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BUDDY_ENTITY.
*/
public class BuddyEntityDao extends AbstractDao<BuddyEntity, Long> {

    public static final String TABLENAME = "BUDDY_ENTITY";

    /**
     * Properties of entity BuddyEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Partial_jid = new Property(1, String.class, "partial_jid", false, "PARTIAL_JID");
        public final static Property Last_seen_resource = new Property(2, String.class, "last_seen_resource", false, "LAST_SEEN_RESOURCE");
        public final static Property Nickname = new Property(3, String.class, "nickname", false, "NICKNAME");
        public final static Property Vibrate = new Property(4, Boolean.class, "vibrate", false, "VIBRATE");
        public final static Property Presence_status = new Property(5, String.class, "presence_status", false, "PRESENCE_STATUS");
        public final static Property Presence_mode = new Property(6, String.class, "presence_mode", false, "PRESENCE_MODE");
        public final static Property Presence_type = new Property(7, String.class, "presence_type", false, "PRESENCE_TYPE");
        public final static Property Last_chat_date = new Property(8, java.util.Date.class, "last_chat_date", false, "LAST_CHAT_DATE");
        public final static Property Last_seen_online_date = new Property(9, java.util.Date.class, "last_seen_online_date", false, "LAST_SEEN_ONLINE_DATE");
        public final static Property IsAvailable = new Property(10, Boolean.class, "isAvailable", false, "IS_AVAILABLE");
        public final static Property IsAway = new Property(11, Boolean.class, "isAway", false, "IS_AWAY");
        public final static Property IsActive = new Property(12, Boolean.class, "isActive", false, "IS_ACTIVE");
        public final static Property ConnectionId = new Property(13, long.class, "connectionId", false, "CONNECTION_ID");
    };

    private DaoSession daoSession;


    public BuddyEntityDao(DaoConfig config) {
        super(config);
    }
    
    public BuddyEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'BUDDY_ENTITY' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'PARTIAL_JID' TEXT NOT NULL ," + // 1: partial_jid
                "'LAST_SEEN_RESOURCE' TEXT," + // 2: last_seen_resource
                "'NICKNAME' TEXT," + // 3: nickname
                "'VIBRATE' INTEGER," + // 4: vibrate
                "'PRESENCE_STATUS' TEXT," + // 5: presence_status
                "'PRESENCE_MODE' TEXT," + // 6: presence_mode
                "'PRESENCE_TYPE' TEXT," + // 7: presence_type
                "'LAST_CHAT_DATE' INTEGER," + // 8: last_chat_date
                "'LAST_SEEN_ONLINE_DATE' INTEGER," + // 9: last_seen_online_date
                "'IS_AVAILABLE' INTEGER," + // 10: isAvailable
                "'IS_AWAY' INTEGER," + // 11: isAway
                "'IS_ACTIVE' INTEGER," + // 12: isActive
                "'CONNECTION_ID' INTEGER NOT NULL );"); // 13: connectionId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BUDDY_ENTITY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BuddyEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPartial_jid());
 
        String last_seen_resource = entity.getLast_seen_resource();
        if (last_seen_resource != null) {
            stmt.bindString(3, last_seen_resource);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(4, nickname);
        }
 
        Boolean vibrate = entity.getVibrate();
        if (vibrate != null) {
            stmt.bindLong(5, vibrate ? 1l: 0l);
        }
 
        String presence_status = entity.getPresence_status();
        if (presence_status != null) {
            stmt.bindString(6, presence_status);
        }
 
        String presence_mode = entity.getPresence_mode();
        if (presence_mode != null) {
            stmt.bindString(7, presence_mode);
        }
 
        String presence_type = entity.getPresence_type();
        if (presence_type != null) {
            stmt.bindString(8, presence_type);
        }
 
        java.util.Date last_chat_date = entity.getLast_chat_date();
        if (last_chat_date != null) {
            stmt.bindLong(9, last_chat_date.getTime());
        }
 
        java.util.Date last_seen_online_date = entity.getLast_seen_online_date();
        if (last_seen_online_date != null) {
            stmt.bindLong(10, last_seen_online_date.getTime());
        }
 
        Boolean isAvailable = entity.getIsAvailable();
        if (isAvailable != null) {
            stmt.bindLong(11, isAvailable ? 1l: 0l);
        }
 
        Boolean isAway = entity.getIsAway();
        if (isAway != null) {
            stmt.bindLong(12, isAway ? 1l: 0l);
        }
 
        Boolean isActive = entity.getIsActive();
        if (isActive != null) {
            stmt.bindLong(13, isActive ? 1l: 0l);
        }
        stmt.bindLong(14, entity.getConnectionId());
    }

    @Override
    protected void attachEntity(BuddyEntity entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public BuddyEntity readEntity(Cursor cursor, int offset) {
        BuddyEntity entity = new BuddyEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // partial_jid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // last_seen_resource
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nickname
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // vibrate
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // presence_status
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // presence_mode
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // presence_type
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // last_chat_date
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // last_seen_online_date
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // isAvailable
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0, // isAway
            cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0, // isActive
            cursor.getLong(offset + 13) // connectionId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BuddyEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPartial_jid(cursor.getString(offset + 1));
        entity.setLast_seen_resource(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNickname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setVibrate(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setPresence_status(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPresence_mode(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPresence_type(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLast_chat_date(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setLast_seen_online_date(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setIsAvailable(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setIsAway(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
        entity.setIsActive(cursor.isNull(offset + 12) ? null : cursor.getShort(offset + 12) != 0);
        entity.setConnectionId(cursor.getLong(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(BuddyEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(BuddyEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getConnectionConfigurationEntityDao().getAllColumns());
            builder.append(" FROM BUDDY_ENTITY T");
            builder.append(" LEFT JOIN CONNECTION_CONFIGURATION_ENTITY T0 ON T.'CONNECTION_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected BuddyEntity loadCurrentDeep(Cursor cursor, boolean lock) {
        BuddyEntity entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        ConnectionConfigurationEntity connectionConfigurationEntity = loadCurrentOther(daoSession.getConnectionConfigurationEntityDao(), cursor, offset);
         if(connectionConfigurationEntity != null) {
            entity.setConnectionConfigurationEntity(connectionConfigurationEntity);
        }

        return entity;    
    }

    public BuddyEntity loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<BuddyEntity> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<BuddyEntity> list = new ArrayList<BuddyEntity>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<BuddyEntity> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<BuddyEntity> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
