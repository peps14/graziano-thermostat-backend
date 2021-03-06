package giuseppe.graziano.thermostat.model.data;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private boolean isAdmin;

    private Long selectedThermostatId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_thermostats", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "thermostat_id", referencedColumnName = "id"))
    private Set<Thermostat> thermostats;


    public User() {
        super();
    }

    //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Long getSelectedThermostatId() {
        return selectedThermostatId;
    }

    public void setSelectedThermostatId(Long selectedThermostatId) {
        this.selectedThermostatId = selectedThermostatId;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Thermostat> getThermostats() {
        return thermostats;
    }

    public void setThermostats(Set<Thermostat> thermostats) {
        this.thermostats = thermostats;
    }
}