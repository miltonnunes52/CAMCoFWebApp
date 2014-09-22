// default package
// Generated 20/Jun/2014 17:25:12 by Hibernate Tools 3.6.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ClassificationTags.
 * @see .ClassificationTags
 * @author Hibernate Tools
 */
@Stateless
public class ClassificationTagsHome {

	private static final Log log = LogFactory
			.getLog(ClassificationTagsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ClassificationTags transientInstance) {
		log.debug("persisting ClassificationTags instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ClassificationTags persistentInstance) {
		log.debug("removing ClassificationTags instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ClassificationTags merge(ClassificationTags detachedInstance) {
		log.debug("merging ClassificationTags instance");
		try {
			ClassificationTags result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ClassificationTags findById(Integer id) {
		log.debug("getting ClassificationTags instance with id: " + id);
		try {
			ClassificationTags instance = entityManager.find(
					ClassificationTags.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
