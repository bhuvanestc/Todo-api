package se.lexicon.g46todoapi.repository;

import org.aspectj.apache.bcel.classfile.LocalVariable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.g46todoapi.domain.entity.Task;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

  List<Task> findByTitle(String title);

  List<Task> findByPersonId(Long personId);

    // todo: select tasks by status
    @Query("SELECT t FROM Task t WHERE t.done = :status")
    List<Task> findByStatus(String status);
  // todo: select tasks by date between start and end
   @Query("SELECT t FROM Task t WHERE t.deadline BETWEEN :startDate AND :endDate")
    List<Task> findByDueDateBetween(LocalDate startDate, LocalDate endDate);
  // todo: select tasks by deadline
  @Query("SELECT t FROM Task t WHERE t.deadline < :deadline")
  List<Task> findByDueDateBefore(LocalDate deadline);
  // todo: select all un-assigned tasks
  @Query("SELECT t FROM Task t WHERE t.person IS NULL")
  List<Task> findByPersonIsNull();
  // todo: select all un-finished tasks
  @Query("SELECT t FROM Task t WHERE not t.done")
  List<Task> findByStatusNotIn(List<String> finishedStatuses);


}
