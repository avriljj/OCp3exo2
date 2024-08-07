package com.openclassrooms.myrepo.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Une classe représentant une tâche avec une description.
 */
public class Task {
    private String description;

    /**
     * Variable Date limite
     */

    private Date dueTime;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description) && Objects.equals(dueTime, task.dueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dueTime);
    }

    /**

     * Constructeur pour créer une nouvelle tâche avec sa description et sa date d'échéance.

     *

     * @param description La description de la tâche.

     * @param dueTime La date d'échéance de la tâche.

     */

    public Task(String description, Date dueTime) {

        this.description = description;

        this.dueTime = dueTime;

    }

    /**
     * Obtient la description de la tâche.
     *
     * @return La description de la tâche.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifie la description de la tâche.
     *
     * @param description La nouvelle description de la tâche.
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**

     * Obtient la date d'échéance de la tâche.

     *

     * @return La date d'échéance de la tâche.

     */

    public Date getDueTime() {

        return dueTime;

    }

    /**
     * Modifie la date limite de la tâche.
     *
     * @param dueTime La nouvelle date limite de la tâche.
     */
    public void setDueTime(Date dueTime) {

        this.dueTime = dueTime;

    }

}
