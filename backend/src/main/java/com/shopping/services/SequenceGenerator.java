//package com.shopping.services;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.object.SqlOperation;
//import org.springframework.stereotype.Service;
//
//import com.shopping.entity.DbSequence;
//
//
//import java.util.Objects;
//
//import javax.persistence.Query;
//
//@Service
//public class SequenceGenerator {
//
//	@Autowired
//	private SqlOperation operation;
//
//	// for user Table
//	public int getSequenceNumberForUser(String sequenceName) {
//		// get sequence number
//		Query query = new Query(Criteria.where("id").is(sequenceName));
//
//		// update seq number
//		Update update = new Update().inc("seq", 1);
//
//		// update into table
//		DbSequence counter = mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true),
//				DbSequence.class);
//		return !Objects.isNull(counter) ? counter.getSeq() : 1;
//	}
//	
//	
//	public int getSequenceNumberForProduct(String sequenceName) {
//		// get sequence number
//		Query query = new Query(Criteria.where("id").is(sequenceName));
//
//		// update seq number
//		Update update = new Update().inc("seq", 1);
//
//		// update into table
//		DbSequence counter = mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true),
//				DbSequence.class);
//		return !Objects.isNull(counter) ? counter.getSeq() : 1;
//	}
//
//}
