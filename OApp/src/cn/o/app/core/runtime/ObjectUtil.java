package cn.o.app.core.runtime;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import cn.o.app.core.io.IOUtil;

public class ObjectUtil {

	public static Object get(Object object, String property) {
		try {
			return OField.getField(object, property).get(object);
		} catch (Exception e) {
			return null;
		}
	}

	public static void set(Object object, String property, Object value) {
		try {
			OField.getField(object, property).set(object, value);
		} catch (Exception e) {

		}
	}

	/**
	 * Deep clone
	 * 
	 * @param object
	 * @see Serializable
	 * 
	 * @return
	 */
	public static Object clone(Object object) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(object);
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			return ois.readObject();
		} catch (Exception e) {
			return null;
		} finally {
			IOUtil.close(bos);
			IOUtil.close(oos);
			IOUtil.close(bis);
			IOUtil.close(ois);
		}
	}

}