/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvoiceGenerator.Models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mtalaat
 */
public class InvoiceHeader {
    public int invoiceNum;
    public Date inoviceDate;
    public String customerName;
    public ArrayList<InvoiceLine> InvoiceLines;
    
}
