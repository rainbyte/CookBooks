package com.t3g.cookbooks.db;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.t3g.cookbooks.db.entities.Author;
import com.t3g.cookbooks.db.entities.Book;
import com.t3g.cookbooks.db.entities.Country;
import com.t3g.cookbooks.db.entities.Language;
import com.t3g.cookbooks.db.entities.Purchase;
import com.t3g.cookbooks.db.entities.Tag;
import com.t3g.cookbooks.db.entities.User;

public class Database {
	private final static String DB_PATH = "jdbc:sqlite:db/cookbooks.db";

	/* Database Connection */
	
	private static JdbcConnectionSource connection;
	private static boolean connectionReady = false;

	private static JdbcConnectionSource getConnection() {
		if (!connectionReady) {
			try {
				connection = new JdbcConnectionSource(DB_PATH);
				connectionReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return connection;		
	}

	/* Authors DAO */
	
	private static Dao<Author, Long> authorDao;
	private static boolean authorDaoReady = false;

	public static Dao<Author, Long> getAuthorDao() {
		if (!authorDaoReady) {
			try {
				authorDao = DaoManager.createDao(getConnection(), Author.class);
				authorDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return authorDao;
	}

	/* Books DAO */
	
	private static Dao<Book, Long> bookDao;
	private static boolean bookDaoReady = false;
	
	public static Dao<Book, Long> getBookDao() {
		if (!bookDaoReady) {
			try {
				bookDao = DaoManager.createDao(getConnection(), Book.class);
				bookDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return bookDao;
	}

	/* Countries DAO */
	
	private static Dao<Country, Long> countryDao;
	private static boolean countryDaoReady = false;

	public static Dao<Country, Long> getCountryDao() {
		if (!countryDaoReady) {
			try {
				countryDao = DaoManager.createDao(getConnection(), Country.class);
				countryDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return countryDao;
	}
	
	/* Languages DAO */
	
	private static Dao<Language, Long> languageDao;
	private static boolean languageDaoReady = false;
	
	public static Dao<Language, Long> getLanguageDao() {
		if (!languageDaoReady) {
			try {
				languageDao = DaoManager.createDao(getConnection(), Language.class);
				languageDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return languageDao;
	}
	
	/* Purchases DAO */
	
	private static Dao<Purchase, Long> purchaseDao;
	private static boolean purchaseDaoReady = false;
	
	public static Dao<Purchase, Long> getPurchaseDao() {
		if (!purchaseDaoReady) {
			try {
				purchaseDao = DaoManager.createDao(getConnection(), Purchase.class);
				purchaseDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return purchaseDao;
	}
	
	/* Tags DAO */
	
	private static Dao<Tag, Long> tagDao;
	private static boolean tagDaoReady = false;
		
	public static Dao<Tag, Long> getTagDao() {
		if (!tagDaoReady) {
			try {
				tagDao = DaoManager.createDao(getConnection(), Tag.class);
				tagDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return tagDao;
	}

	/* Users DAO */
	
	private static Dao<User, Long> userDao;
	private static boolean userDaoReady = false;
	
	public static Dao<User, Long> getUserDao() {
		if (!userDaoReady) {
			try {
				userDao = DaoManager.createDao(getConnection(), User.class);
				userDaoReady = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return userDao;
	}
}
