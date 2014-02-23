/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Wathsala
 */
@Entity
@Table(name = "bookdetails", catalog = "bookstore", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookdetails.findAll", query = "SELECT b FROM Bookdetails b"),
    @NamedQuery(name = "Bookdetails.findByIndexId", query = "SELECT b FROM Bookdetails b WHERE b.indexId = :indexId"),
    @NamedQuery(name = "Bookdetails.findByIsbn", query = "SELECT b FROM Bookdetails b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Bookdetails.findByBookName", query = "SELECT b FROM Bookdetails b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Bookdetails.findByAuthorFName", query = "SELECT b FROM Bookdetails b WHERE b.authorFName = :authorFName"),
    @NamedQuery(name = "Bookdetails.findByAuthorLName", query = "SELECT b FROM Bookdetails b WHERE b.authorLName = :authorLName")})
public class Bookdetails implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IndexId")
    private Integer indexId;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private int isbn;
    @Basic(optional = false)
    @Column(name = "BookName")
    private String bookName;
    @Basic(optional = false)
    @Column(name = "AuthorFName")
    private String authorFName;
    @Column(name = "AuthorLName")
    private String authorLName;

    public Bookdetails() {
    }

    public Bookdetails(Integer indexId) {
        this.indexId = indexId;
    }

    public Bookdetails(Integer indexId, int isbn, String bookName, String authorFName) {
        this.indexId = indexId;
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorFName = authorFName;
    }

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        Integer oldIndexId = this.indexId;
        this.indexId = indexId;
        changeSupport.firePropertyChange("indexId", oldIndexId, indexId);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        int oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        String oldBookName = this.bookName;
        this.bookName = bookName;
        changeSupport.firePropertyChange("bookName", oldBookName, bookName);
    }

    public String getAuthorFName() {
        return authorFName;
    }

    public void setAuthorFName(String authorFName) {
        String oldAuthorFName = this.authorFName;
        this.authorFName = authorFName;
        changeSupport.firePropertyChange("authorFName", oldAuthorFName, authorFName);
    }

    public String getAuthorLName() {
        return authorLName;
    }

    public void setAuthorLName(String authorLName) {
        String oldAuthorLName = this.authorLName;
        this.authorLName = authorLName;
        changeSupport.firePropertyChange("authorLName", oldAuthorLName, authorLName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexId != null ? indexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookdetails)) {
            return false;
        }
        Bookdetails other = (Bookdetails) object;
        if ((this.indexId == null && other.indexId != null) || (this.indexId != null && !this.indexId.equals(other.indexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Forms.Bookdetails[ indexId=" + indexId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
