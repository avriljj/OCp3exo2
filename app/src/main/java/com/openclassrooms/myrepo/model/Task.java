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
    private Date deadline;

    /**
     * Constructeur pour créer une nouvelle tâche avec une description.
     *
     * @param description La description de la tâche.
     */
    public Task(String description) {
        this.description = description;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        this.deadline = calendar.getTime();
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
     * Vérifie si deux objets Task sont égaux en comparant leurs descriptions.
     *
     * @param o L'objet à comparer.
     * @return Vrai si les descriptions sont égales, sinon faux.
     */

    /**
     * Obtient la date limite de la tâche.
     *
     * @return La date limite de la tâche.
     */
    public String getDeadline() {
        Date currentDate = new Date();
        long diffInMillies = deadline.getTime() - currentDate.getTime();
        long daysLeft = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return daysLeft + " days left";
    }

    /**
     * Modifie la date limite de la tâche.
     *
     * @param deadline La nouvelle date limite de la tâche.
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description);
    }

    /**
     * Calcule le code de hachage en utilisant la description de la tâche.
     *
     * @return Le code de hachage calculé.
     */
    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
