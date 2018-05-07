package com.rick;

import com.rick.compositeid.dao.LabelRepository;
import com.rick.compositeid.dao.TaskRepository;
import com.rick.compositeid.entity.Label;
import com.rick.compositeid.entity.LabelKey;
import com.rick.compositeid.entity.Task;
import com.rick.quickstart.dao.StudentRepository;
import com.rick.quickstart.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateDemoApplicationTests {



	@Resource
	private LabelRepository labelRepository;

	@Resource
	private TaskRepository taskRepository;

	@Test
	public void compositeKey() {
		LabelKey labelKey = new LabelKey();
		labelKey.setCategory("TASK");
//		labelKey.setCategoryId(1L);

		Label label = new Label();
//		label.setLabelKey(labelKey);
		label.setTitle("重要");
		labelRepository.save(label);
	}

	@Test
	public void compositeKeyForeign() {
		Task task = new Task();
		task.setTitle("this ia a new task2");

		Label label = new Label();

//		label.setTask(task);

		LabelKey labelKey = new LabelKey();
		labelKey.setCategory("TASK");
//		label.setLabelKey(labelKey);

		label.setTitle("重要");

		labelRepository.save(label);

	}

	@Test
	public void compositeKeyForeign2() {
		Task task = new Task();
		task.setTitle("this ia a new task3xxxxooo");

		Label label = new Label();

		label.setTask(task);
		LabelKey labelKey = new LabelKey();
		labelKey.setCategory("TASK");

		label.setLabelKey(labelKey);
		label.setTitle("重要");

		labelRepository.save(label);
	}




}
