package tsamou.refinery.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tsamou.refinery.models.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
