
package org.chamerling.heroku.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.chamerling.heroku.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadUser_QNAME = new QName("http://service.heroku.chamerling.org/", "readUser");
    private final static QName _AddPost_QNAME = new QName("http://service.heroku.chamerling.org/", "addPost");
    private final static QName _UpdateUser_QNAME = new QName("http://service.heroku.chamerling.org/", "updateUser");
    private final static QName _ReadUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "readUserResponse");
    private final static QName _DelUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "delUserResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "addUserResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "updateUserResponse");
    private final static QName _AddPostResponse_QNAME = new QName("http://service.heroku.chamerling.org/", "addPostResponse");
    private final static QName _AddUser_QNAME = new QName("http://service.heroku.chamerling.org/", "addUser");
    private final static QName _DelUser_QNAME = new QName("http://service.heroku.chamerling.org/", "delUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.chamerling.heroku.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPostResponse }
     * 
     */
    public AddPostResponse createAddPostResponse() {
        return new AddPostResponse();
    }

    /**
     * Create an instance of {@link DelUser }
     * 
     */
    public DelUser createDelUser() {
        return new DelUser();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ReadUserResponse }
     * 
     */
    public ReadUserResponse createReadUserResponse() {
        return new ReadUserResponse();
    }

    /**
     * Create an instance of {@link AddPost }
     * 
     */
    public AddPost createAddPost() {
        return new AddPost();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link ReadUser }
     * 
     */
    public ReadUser createReadUser() {
        return new ReadUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DelUserResponse }
     * 
     */
    public DelUserResponse createDelUserResponse() {
        return new DelUserResponse();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "readUser")
    public JAXBElement<ReadUser> createReadUser(ReadUser value) {
        return new JAXBElement<ReadUser>(_ReadUser_QNAME, ReadUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addPost")
    public JAXBElement<AddPost> createAddPost(AddPost value) {
        return new JAXBElement<AddPost>(_AddPost_QNAME, AddPost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "readUserResponse")
    public JAXBElement<ReadUserResponse> createReadUserResponse(ReadUserResponse value) {
        return new JAXBElement<ReadUserResponse>(_ReadUserResponse_QNAME, ReadUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "delUserResponse")
    public JAXBElement<DelUserResponse> createDelUserResponse(DelUserResponse value) {
        return new JAXBElement<DelUserResponse>(_DelUserResponse_QNAME, DelUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addPostResponse")
    public JAXBElement<AddPostResponse> createAddPostResponse(AddPostResponse value) {
        return new JAXBElement<AddPostResponse>(_AddPostResponse_QNAME, AddPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.heroku.chamerling.org/", name = "delUser")
    public JAXBElement<DelUser> createDelUser(DelUser value) {
        return new JAXBElement<DelUser>(_DelUser_QNAME, DelUser.class, null, value);
    }

}
