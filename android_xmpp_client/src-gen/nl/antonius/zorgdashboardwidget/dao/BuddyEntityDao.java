package nl.antonius.zorgdashboardwidget.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;

import nl.antonius.zorgdashboardwidget.dao.BuddyEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BUDDY_ENTITY.
*/
public class BuddyEntityDao extends AbstractDao<BuddyEntity, Void> {

    public static final String TABLENAME = "BUDDY_ENTITY";

    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Partial_jid = new Property(1, String.class, "partial_jid", true, "PARTIAL_JID");
        public final static Property Resource = new Property(2, String.class, "resource", true, "RESOURCE");
        public final static Property Nickname = new Property(3, String.class, "nickname", false, "NICKNAME");
        public final static Property Presence = new Property(4, String.class, "presence", false, "PRESENCE");
        public final static Property Custom_away_string = new Property(5, String.class, "custom_away_string", false, "CUSTOM_AWAY_STRING");
        public final static Property Last_seen_date = new Property(6, java.util.Date.class, "last_seen_date", false, "LAST_SEEN_DATE");
    };


    public BuddyEntityDao(DaoConfig config) {
        super(config);
    }
    
    public BuddyEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String sql = "CREATE TABLE " + (ifNotExists? "IF NOT EXISTS ": "") + "'BUDDY_ENTITY' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'PARTIAL_JID' TEXT PRIMARY KEY NOT NULL ," + // 1: partial_jid
                "'RESOURCE' TEXT PRIMARY KEY NOT NULL ," + // 2: resource
                "'NICKNAME' TEXT NOT NULL ," + // 3: nickname
                "'PRESENCE' TEXT NOT NULL ," + // 4: presence
                "'CUSTOM_AWAY_STRING' TEXT NOT NULL ," + // 5: custom_away_string
                "'LAST_SEEN_DATE' INTEGER);"; // 6: last_seen_date
        db.execSQL(sql);
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
        stmt.bindString(3, entity.getResource());
        stmt.bindString(4, entity.getNickname());
        stmt.bindString(5, entity.getPresence());
        stmt.bindString(6, entity.getCustom_away_string());
 
        java.util.Date last_seen_date = entity.getLast_seen_date();
        if (last_seen_date != null) {
            stmt.bindLong(7, last_seen_date.getTime());
        }
    }

    /** @inheritdoc */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override
    public BuddyEntity readEntity(Cursor cursor, int offset) {
        BuddyEntity entity = new BuddyEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // partial_jid
            cursor.getString(offset + 2), // resource
            cursor.getString(offset + 3), // nickname
            cursor.getString(offset + 4), // presence
            cursor.getString(offset + 5), // custom_away_string
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)) // last_seen_date
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BuddyEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPartial_jid(cursor.getString(offset + 1));
        entity.setResource(cursor.getString(offset + 2));
        entity.setNickname(cursor.getString(offset + 3));
        entity.setPresence(cursor.getString(offset + 4));
        entity.setCustom_away_string(cursor.getString(offset + 5));
        entity.setLast_seen_date(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
     }
    
    @Override
    protected Void updateKeyAfterInsert(BuddyEntity entity, long rowId) {
        // TODO XXX Only Long PKs are supported currently
        return null;
    }
    
    /** @inheritdoc */
    @Override
    public Void getKey(BuddyEntity entity) {
        return null;
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
