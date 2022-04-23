using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADOApplication
{
    class Customer
    {
        private int customerId ;
        private String customerName;
        private String customerEmail;
        private String customerPhone;
        private Address custAddress;
        public int CustomerId { get => customerId; set => customerId = value; }

        public string CustomerName { get => customerName; set => customerName = value; }
        public string CustomerEmail { get => customerEmail; set => customerEmail = value; }
        public string CustomerPhone { get => customerPhone; set => customerPhone = value; }
        public Address CustAddress { get => custAddress; set => custAddress = value; }
    }
}
