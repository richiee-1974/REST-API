package com.RMgX.sagarprasad.repository;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RMgX.sagarprasad.Entity.AssetsEntity;
import com.RMgX.sagarprasad.Entity.CategoryEntity;


@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

	Category saveAll(Category category);

	void save(Category productUpdate);

	void deleteById(CategoryEntity categoryEntity);

	List<Category> findAllById();

	void deleteAllById(CategoryEntity categoryEntity);

	Category saveAll(AssetsEntity assets);

}
