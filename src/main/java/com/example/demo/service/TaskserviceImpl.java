package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Task;

public class TaskserviceImpl implements TaskService {

	@Override
	public List<Task> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Optional<Task> getTask(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void insert(Task task) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void update(Task task) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void deleteById(int id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public List<Task> findByType(int typeId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}

/*
 * 
 * package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskDao;

@Service
public class TaskServiceImpl implements TaskService {

	private final TaskDao dao;

	public TaskServiceImpl(TaskDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Task> findAll() {
		return dao.findAll();
	}

	@Override
	public Optional<Task> getTask(int id) {

		//Optional<Task>一件を取得 idが無ければ例外発生　
		try {
			return dao.findById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new TaskNotFoundException("指定されたタスクが存在しません");
		}
	}

	@Override
	public void insert(Task task) {
		dao.insert(task);
	}

	@Override
	public void update(Task task) {

		//Taskを更新　idが無ければ例外発生
		if(dao.update(task) == 0) {
			throw new TaskNotFoundException("更新するタスクが存在しません");
		}
	}

	@Override
	public void deleteById(int id) {

		//Taskを更新 idがなければ例外発生
		if(dao.deleteById(id) == 0) {
			throw new TaskNotFoundException("削除するタスクが存在しません");
		}
	}

	@Override
	public List<Task> findByType(int typeId) {
		//2-3 typeIdを引数に指定してdaoのfindByType実行し、結果をreturnする
		return dao.findByType(typeId);
	}
}
*/
