package com.hr.mapper;

import java.util.List;



import org.springframework.stereotype.Repository;


@Repository
public interface ConfigPublicCharMapperSjh {
	public List<String> findConfigPublicCharByAttributeKind(String name);
	
}
