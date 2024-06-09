package ma.emsi.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.IDAO.DAO;
import ma.emsi.entities.ForContinue;
import ma.emsi.repositories.ForContinueRep;

@Service
public class ForContinueService implements DAO<ForContinue> {

    @Autowired
    private ForContinueRep forContinueRep;

    @Override
    public ForContinue save(ForContinue object) {
        System.out.println("Saving in Service: " + object); // Log the object being saved
        return this.forContinueRep.save(object);
    }

    @Override
    public ForContinue update(int id, ForContinue object) {
        object.setId(id);
        System.out.println("Updating in Service ID " + id + ": " + object); // Log the object being updated
        return this.forContinueRep.save(object);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting in Service ID " + id); // Log the ID of the object being deleted
        this.forContinueRep.deleteById(id);
    }

    @Override
    public ForContinue findById(int id) {
        Optional<ForContinue> optional = this.forContinueRep.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<ForContinue> findAll() {
        return this.forContinueRep.findAll();
    }
}
